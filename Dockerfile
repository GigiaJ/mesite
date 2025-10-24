FROM node:18-bullseye AS builder
RUN apt-get update && apt-get install -y default-jre
WORKDIR /app
COPY package.json package-lock.json shadow-cljs.edn ./
RUN npm install
COPY src ./src
COPY public ./public
RUN npx shadow-cljs release :app


FROM nginx:alpine
COPY --from=builder /app/public /usr/share/nginx/html
COPY nginx.conf /etc/nginx/conf.d/default.conf
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
(ns landing
  (:require [reagent.dom :as rdom]))

(defn social-links []
  [:div {:class "social-links"}
   [:a {:href "https://codeberg.org/Gigia"} "Codeberg"] " | "
   [:a {:href "https://matrix.to/#/@GigiaJ:matrix.org"} "Matrix"] " | " 
   [:a {:href "https://github.com/GigiaJ"} "GitHub"] " | "
   [:a {:href "https://discord.gg/tsZnXfzMYG"} "Discord"] " | "
   [:a {:href "https://linkedin.com/in/jaggar-boone-74017219b"} "LinkedIn"]])

(defn personal-site []
  [:div {:class "main-container"}
   [:h1 "Jaggar"]
   [:p "Sometimes I do stuff. Fairly often really."]
   [:p
    "Active contributor to "
    [:a {:href "https://guix.gnu.org"} "Guix"]
    " -as a package maintainer- and "
    [:a {:href "https://github.com/GigiaJ/cinny"} "Cinny (Matrix client)"]
    "."] 
   [:p "Software engineer (and more) at Ocean Spray Cranberries. I adore farmer-owned co-ops; companies shouldn't be driven to improve stock prices."]
   [:p "Large proponent for free open source software, however I believe users should not be directly bridled from choices that are unequivocally pro-sumer."] 
   [:br]
   [:br]
   [:br]
   [:h2 "Some of the other stuff"]
   [:p "Creator of " [:a {:href "https://github.com/OSRSB/OsrsBot"} "OSRSB"] " a botting API for Old School RuneScape."]
   [:p [:a {:href "https://github.com/GigiaJ/Renny"} "Infrequent" ] " software reverse engineer for games. Zig soon though."]
   [:p [:a {:href "https://github.com/GigiaJ/dotfiles/tree/master/guix/.config/guix"} "My Guix home configuration"] " if you want your Guix config just like mine for some reason. (It's an alright reference I guess)."] 
   [:p [:a {:href "https://github.com/GigiaJ/dotfiles/tree/master/iac"} "My Clojurescript Pulumi IaC"] " for an unmanaged K8 cluster with hcloud."]
   [:p [:a {:href "https://codeberg.org/Gigia/gunit"} "My Guix channel"] " where I have some packages that aren't upstreamed."]
   [:br]
   [:br]
   [:br]
   [:p "This is created with love in Clojurescript. Multe da amo."]
   [:a {:href "https://codeberg.org/Gigia/mesite"} "The code for which is here. (It is very succinct)."]
   [:br]
   [:br]
   [:p "You can check out my work or reach me at one of the following:"]
   [social-links]])

(defn ^:export init []
  (rdom/render [personal-site]
               (.getElementById js/document "app")))
(ns bible.scenes.root.views
  (:require [re-frame.core :as re-frame]
            [utils.bootstrap :as bs]
            [utils.re-frame :refer [>evt <sub]]
            [utils.helpers :as h]
            [bible.services.routes :as routes]
            [bible.components.skeleton :as skeleton]
            bible.scenes.word.views))


(defn main-panel []
  [:div
   [skeleton/Navbar
    {:brand [:a "Bible"]
     :right [[bs/NavItem "Home"]
             [bs/NavItem "Devotionals"]
             [bs/NavItem "Promises"]
             [bs/NavItem "Race"]]}]
   (routes/views (<sub [:active-panel]))
   [:a {:href (routes/url-for :about)} "About"]
   [:div "Hello from " (<sub [:name])]])


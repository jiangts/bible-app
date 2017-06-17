(ns bible.scenes.root.views
  (:require [re-frame.core :as re-frame]
            [utils.bootstrap :as bs]
            [utils.re-frame :refer [>evt <sub]]))


(defn main-panel []
  [:div "Hello from " (<sub [:name])])

(ns bible.scenes.word.views
  (:require [re-frame.core :as re-frame]
            [utils.bootstrap :as bs]
            [utils.re-frame :refer [>evt <sub]]
            [bible.services.routes :as routes]
            [bible.components.skeleton :as skeleton]))

(defn panel []
  [:div "HELLO"])

(def views routes/views)
(defmethod views :about [] [panel])


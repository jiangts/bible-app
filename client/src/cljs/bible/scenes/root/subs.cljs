(ns bible.scenes.root.subs
  (:require-macros [reagent.ratom :refer [reaction]])
  (:require [re-frame.core :as re-frame]
            [utils.re-frame :as rfutils :refer [>evt <sub]]))


(re-frame/reg-sub :name rfutils/query)
(re-frame/reg-sub :active-panel rfutils/query)

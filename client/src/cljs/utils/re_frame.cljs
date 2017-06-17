(ns utils.re-frame
  (:require [re-frame.core :as re-frame]))


;; views ;;;;
(def <sub (comp deref re-frame.core/subscribe))
(def >evt re-frame.core/dispatch)


;; subscriptions ;;;;
(defn- query [db [k]]
  (get db k))


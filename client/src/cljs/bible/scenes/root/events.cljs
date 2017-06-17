(ns bible.scenes.root.events
  (:require [re-frame.core :as re-frame]
            [bible.db :as db]))


(re-frame/reg-event-db
 :initialize-db
 (fn  [_ _]
   db/default-db))


(re-frame/reg-event-db
 :set-active-panel
 (fn  [db [_ panel]]
   (assoc db :active-panel panel)))


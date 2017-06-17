(ns bible.services.feathers
  (:require [utils.libs :refer [feathers socket-io]]))

(defonce app (-> (feathers)
               (.configure (.hooks feathers))
               (.configure (.socketio feathers (socket-io)))))


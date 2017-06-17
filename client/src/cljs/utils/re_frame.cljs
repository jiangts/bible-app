(ns utils.re-frame
  (:require [re-frame.core :as re-frame]))


(def <sub (comp deref re-frame.core/subscribe))
(def >evt re-frame.core/dispatch)


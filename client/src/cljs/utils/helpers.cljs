(ns utils.helpers)


(defn- p [& args]
  (apply (.-log js/console) args)
  (last args))


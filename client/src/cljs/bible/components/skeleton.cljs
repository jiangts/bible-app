(ns bible.components.skeleton
  (:require [utils.bootstrap :as bs]))


;; https://react-bootstrap.github.io/components.html#navbars
(defn Navbar [{:keys [brand left right]}]
  [bs/Navbar
   [bs/Navbar.Header
    [bs/Navbar.Brand brand]
    [bs/Navbar.Toggle]]
   [bs/Navbar.Collapse
    (into [bs/Nav] left)
    (into [bs/Nav {:pull-right true}] right)]])


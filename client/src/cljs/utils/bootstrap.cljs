(ns utils.bootstrap
  (:require [utils.libs :refer [bootstrap]]
            [reagent.core :as reagent])
  (:require-macros [utils.reagent :refer [require-reagent-class]]))


(require-reagent-class
  bootstrap
  ["Navbar"
   "Form"
   "FormGroup"
   "FormControl"
   "Checkbox"
   "Col"
   "ControlLabel"
   "Button"
   "Nav"
   "Navbar.Header"
   "Navbar.Brand"
   "Navbar.Toggle"
   "Navbar.Collapse"
   "NavItem"
   ])


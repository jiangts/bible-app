(ns bible.scenes.login.views
  (:require [utils.bootstrap :as bs]))


(defn login-form []
  [bs/Form {:horizontal true}

   [bs/FormGroup {:control-id (str ::email)}
    [bs/Col {:component-class [bs/ControlLabel] :sm 2}
     "Email"]
    [bs/Col {:sm 10}
     [bs/FormControl {:type "email" :placeholder "Email"}]]]

   [bs/FormGroup {:control-id (str ::password)}
    [bs/Col {:component-class [bs/ControlLabel] :sm 2}
     "Password"]
    [bs/Col {:sm 10}
     [bs/FormControl {:type "password" :placeholder "Password"}]]]

   [bs/FormGroup
    [bs/Col {:sm-offset 2 :sm 10}
     [bs/Checkbox "Remember me"]]]

   [bs/FormGroup
    [bs/Col {:sm-offset 2 :sm 10}
     [bs/Button {:type "submit"}
      "Sign in"]]]])


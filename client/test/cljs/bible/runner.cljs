(ns bible.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [bible.core-test]))

(doo-tests 'bible.core-test)

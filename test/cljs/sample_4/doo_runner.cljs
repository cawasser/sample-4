(ns sample-4.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [sample-4.core-test]))

(doo-tests 'sample-4.core-test)


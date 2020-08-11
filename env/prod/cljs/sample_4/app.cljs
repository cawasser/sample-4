(ns sample-4.app
  (:require [sample-4.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)

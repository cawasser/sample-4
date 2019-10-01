(ns sample-4.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[sample-4 started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[sample-4 has shut down successfully]=-"))
   :middleware identity})

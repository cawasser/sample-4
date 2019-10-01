(ns sample-4.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [sample-4.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[sample-4 started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[sample-4 has shut down successfully]=-"))
   :middleware wrap-dev})

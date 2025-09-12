(ns bebes-reborn.service.schema
  (:require [malli.core :as m]))

(def Size [:enum :prematuro :recien-nacido])

(def Kit
  [:map
   [:id uuid?]
   [:model string?]
   [:has-eyes boolean?]
   [:amount pos-int?]
   [:size Size]])

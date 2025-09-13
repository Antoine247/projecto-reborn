(ns bebes-reborn.service.factories
  (:require [bebes-reborn.service.schema :as s]
            [malli.generator :as mg]
            [malli.core :as m]))

(defn gen-kit
  []
  (mg/generate s/Kit))

(defn gen-baby
  ([] (gen-baby (gen-kit)))
  ([kit]
   (assoc (mg/generate s/Baby) :kit-id (:id kit))))

(defn gen-sale 
  ([] (let [kit (gen-kit)
            baby (gen-baby kit)]
        (gen-sale baby)))
  ([baby]
   (assoc (mg/generate s/Sale) :baby-id (:id baby))))

(defn gen-kits [n]   (repeatedly n gen-kit))
(defn gen-babies [n] (repeatedly n gen-baby))
(defn gen-sales [n]  (repeatedly n gen-sale))
(comment
  (gen-kit)
  (gen-baby)
  (every? #(m/validate s/Sale %) (gen-sales 50))
  (every? )
  (random-model)
  )
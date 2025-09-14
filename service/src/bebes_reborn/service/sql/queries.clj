(ns bebes-reborn.service.sql.queries
  (:require [honey.sql :as sql]))

;; kits
(defn all-kits
  "select all de todos los kits de la base"
  []
  (sql/format {:select [:*]
               :from :kits
               :order-by [:model]}))

(defn create-kit
  "inserta un kit dentro del sistema"
  [{:keys [model has_eyes amount size] :as kit}]
  (sql/format {:insert-into :kits
               :columns [:model :has_eyes :amount :size]
               :values [model has_eyes amount size]}))

(defn update-amount
  "actualiza la cantidad de kits de acuerdo a un ID"
  []
  ())
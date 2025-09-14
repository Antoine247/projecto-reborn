(ns bebes-reborn.service.schema)

(def Size [:enum :prematuro :recien-nacido])
(def Currency [:enum :ARS :USD])
(def BabyStatus [:enum :en-proceso :listo :vendido])
(def SaleStatus [:enum :cenada :anulada :completada])
(def PaymentMethod [:enum :efectivo :transferencia :tarjeta])
(def random-model ["Saskia" "Levi" "Athena" "Lulu" "Ava" "Noah"])

(def Money
  [:map
   [:amount [:and int? [:fn #(>= % 0)]]]
   [:currency Currency]])
(def Kit
  [:map
   [:id uuid?]
   [:model [:and {:gen/elements random-model} :string]]
   [:has-eyes boolean?]
   [:amount [:int {:min 1, :max 100}]]
   [:size Size]])

(def Baby
  [:map
   [:id uuid?]
   [:kit-id uuid?]
   [:length-cm {:optional true} pos-int?]
   [:photos {:optional true} [:sequential string?]]
   [:status BabyStatus]])

(def Sale
  [:map
   [:id uuid?]
   [:date inst?]
   [:baby-id uuid?]
   [:price Money]
   [:rate-usd [:and number? pos?]]
   [:price-ars [:and int? [:fn #(>= % 0)]]]
   [:payment-method PaymentMethod]
   [:notes {:optional true} [:maybe string?]]
   [:status SaleStatus]
   [:created-at inst?]
   [:updated-at inst?]])



(ns clj-slack.im
  (:use [clj-slack.core :only [slack-request]])
  (:refer-clojure :exclude [list]))

(defn history
  "Fetches history of messages and events from direct message channel."
  [connection channel-id]
  (slack-request connection "im.history" {"channel" channel-id}))

(defn list
  "Lists direct message channels for the calling user."
  [connection]
  (slack-request connection "im.list"))

(defn mark
  "Sets the read cursor in a direct message channel."
  [connection channel-id timestamp]
  (slack-request connection "im.mark" {"channel" channel-id "ts" timestamp}))

(ns hello-three.utils
  (:require [three :as t]))

(defprotocol Convienience
  (pos [this x y z] "set the position of the Object3D"))

(extend-type t/Object3D
  Convienience
  (pos [this x y z]
    (.set (.-position this) x y z)))

(comment


  (def s (t/Scene.))

  (pos s 1 2 3)

  (.-y (.-position s))

  *)

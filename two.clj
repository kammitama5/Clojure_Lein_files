;;polymorphism
;;type-oriented polymorphic behavior => protocols

;;multimethods

;;records
;;types

;;Concurrency

;; Identity, Value, State

;;Identities are pointers to locations in memory

;;atoms => common construct for mutable shared state

;; deref-> get current value of an atom

;;change (swap! atom and function)

;; compare and swap 
;;stm => software transactional memory

;; dosync => coordinated changes

(def a (ref 1))
(def b (ref 10))

(dosync
	(alter a inc)
	(alter b + 10))

;; to call a or b
@a ;; prints 2
@b ;; prints 20

;;atoms use swap
;;refs use alter => atoms and refs are
;; not interchangeable

;;internal deadlock -> a waiting for b, b is
;; waiting for a to occur

;;ensure -> if transaction changes, 
;;the transaction will fail and retry

;;savings and fee are refs
;;(dosync
;;	(alter savings + @fee))

;; commute -> don't care what order 
;;more concurrency than alter

(def counter (ref 1))

(dosync (commute counter inc))

(dosync (commute counter + 30))

;;-> optimization


;;Agent
;; changes to agents are asynchronous

;;watch -> notifies when a state changes

;; use require instead of use

;; (deref (var quux)) => (@# 'quux')
;; deref var called quux
;;quux -> nil







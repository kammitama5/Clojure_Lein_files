;; eval vs quote
(def x 3)
(+ x 2) ;; returns 5
(quote (+ x 2))
;; returns '(+ x 2)


;;apply
;;invokes function on arguments
;;final argument is a sequence
;; "unpacks" remaining args from a sequence

(for [letter [:a :b]
	number (range 3)])

;;returns 
;;([:a 0][:a 1][:a 2][:b 0][:b 1][:b 2])


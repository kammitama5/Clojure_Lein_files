(when (even? 2)
	(println "16")) 

;; prints 16

;;when-let => only do let when ...

;; homoiconic 

;; macros run when code is being compiled

;; dynamic -> define functions before macro used

;; macroexpand -> run tests on macros

(defmacro my-when [test & body]
	`(if ~test
		(do
			~@body))

;; ~ => the value of
;;(doc macroexpand)

;; ` => used mostly for macros

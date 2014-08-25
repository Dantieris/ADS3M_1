<?php
	/**
	* Implement an ordened list.
	*/
	include(Nodo);
	class List extends AnotherClass implements Iterator 
	{
		
		private $head; // The begining of the list; Nodo type.
		private $tail; // The ending of the list; Nodo type.

		function __construct(argument)
		{
			# code...
		}

		function rewind() {

		}

		function current() {

		}

		function key() {

		}

		function next() {

		}

		function valid() {
			
		}


		function insert($value) {
			$newNodo = new Nodo($value);

			if(isEmpty()) {
				$this->head = $newNodo;
				$this->tail = $newNodo;
			}
			else {
				$nextNodo = findNext($value);
				if(!is_null($nextNodo)) {
					$newNodo->setNext($nextNodo);
					$newNodo->setPrevious($nextNodo->getPrevious);

					if(!is_null($newNodo->getPrevious)) {
						$newNodo->getPrevious->setPrevious($newNodo);
					} else {
						$this->head = $newNodo;
					}
					$newNodo->getNext->setPrevious($newNodo);
				}
				else {
					$newNodo->setNext(null);
					$newNodo->setPrevious($this->tail);
				}
			}
		}

		function remove($value) {
			$nodo = search($value);

			if ($nodo == false) {
				return false;
			}

			if ($nodo == $this->head) {
				$this->head = $nodo->getNext;
				return;
			} elseif ($nodo == $this->tail) {
				$this->tail = $nodo->getPrevious;
				$this->tail->setNext(null);
				return;
			} else {
				$nodo->getPrevious->setNext($nodo->getNext);
				$nodo->getNext->setPrevious($nodo->getPrevious);
			}
		}

		function search($value) {
			$iter = $this->head;

			while (!is_null($iter)) {
				if ($iter->getValue == $value) {
					return $iter;
				}

				if ($iter->value > $value) {
					return false;
				}

				$iter = $iter->getNext();
			}


		}

		private function isEmpty() {
			if(is_null($this->head)) {
				return true;
			} else {
				return false;
			}
		}

		private function findNext($value) {
			$iter = $this->head;

			while (!is_null($this->head)) {
				if($iter->getValue() < $value) {
					return $iter;
				}

				$iter = $iter->getNext;
			}
		}
	}
?>
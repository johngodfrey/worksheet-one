class Deque<T> {
    private var head: Element<T>? = null

    fun push(value: T) {
        if (head == null) {
            head = Element(value)
        } else {
            var foundEnd = false
            var lastNode = head
            while (!foundEnd) {
                if (lastNode?.next == null) {
                    foundEnd = true
                } else {
                    lastNode = lastNode?.next
                }
            }
            val newNode = Element(value)
            lastNode?.next = newNode
            newNode.prev = lastNode
        }
    }

    fun pop(): T? {
        if (head == null) {
            return null
        } else {
            var foundEnd = false
            var lastNode = head
            while (!foundEnd) {
                if (lastNode?.next == null) {
                    foundEnd = true
                } else {
                    lastNode = lastNode?.next
                }
            }
            lastNode?.prev?.next = null
            return lastNode?.value
        }
    }

    fun unshift(value: T) {
        val newNode = Element(value)
        newNode.next = head
        head?.prev = newNode
        head = newNode
    }

    fun shift(): T? {
        val value = head?.value
        head = head?.next
        return value
    }

    private data class Element<T>(val value: T, var prev: Element<T>? = null, var next: Element<T>? = null)
}
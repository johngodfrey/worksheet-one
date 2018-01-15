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
            println("Setting lastnode next to new node")
            lastNode?.next = newNode
            newNode.prev = lastNode
        }
        println(this.head.toString())
    }

    fun pop(): T? {
        // TODO
        return shift()
    }

    fun unshift(value: T) {
        // TODO
    }

    fun shift(): T? {
        val value = head?.value
        // TODO
        return value
    }

    private data class Element<T>(val value: T, var prev: Element<T>? = null, var next: Element<T>? = null)
}
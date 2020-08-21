//不使用任何内建的哈希表库设计一个哈希映射 
//
// 具体地说，你的设计应该包含以下的功能 
//
// 
// put(key, value)：向哈希映射中插入(键,值)的数值对。如果键对应的值已经存在，更新这个值。 
// get(key)：返回给定的键所对应的值，如果映射中不包含这个键，返回-1。 
// remove(key)：如果映射中存在这个键，删除这个数值对。 
// 
//
// 
//示例： 
//
// MyHashMap hashMap = new MyHashMap();
//hashMap.put(1, 1);          
//hashMap.put(2, 2);         
//hashMap.get(1);            // 返回 1
//hashMap.get(3);            // 返回 -1 (未找到)
//hashMap.put(2, 1);         // 更新已有的值
//hashMap.get(2);            // 返回 1 
//hashMap.remove(2);         // 删除键为2的数据
//hashMap.get(2);            // 返回 -1 (未找到) 
// 
//
// 
//注意： 
//
// 
// 所有的值都在 [0, 1000000]的范围内。 
// 操作的总数目在[1, 10000]范围内。 
// 不要使用内建的哈希库。 
// 
// Related Topics 设计 哈希表 
// 👍 63 👎 0







































































































class MyHashMap() {


    /** Initialize your data structure here. */
    val BUCKET_NUM = 797 
    val buckets = new Array[Tree](BUCKET_NUM)

    for(i<-0 until BUCKET_NUM) {
      buckets(i) = new Tree()
    }

    class Tree(){
      var root :KVNode = null

      def insert(node:KVNode, key:Int, value: Int): KVNode = {
        if(node == null) return new KVNode(key, value)
        if(key == node.key) {
          node.value = value 
          return node
        }
        if(key < node.key) {
          node.left = insert(node.left, key, value)
        }else {
          node.right = insert(node.right, key, value)
        }
        return node 
      }

      def delete(node:KVNode, key:Int) : KVNode = {

        if(node == null) return null
        var leftPrev = node.left

        while(leftPrev != null && leftPrev.right != null){
          leftPrev = leftPrev.right
        }

        if(key == node.key) {
          if(leftPrev == null) return node.right
          else {
            leftPrev.right = node.right 
            return leftPrev
          }
        }

        if( key < node.key ){
          node.left = delete(node.left, key)
        }else{
          node.right = delete(node.right, key)
        }
        return node
      }

      def get(node:KVNode, key:Int):Int = {
        if(node == null) return -1
        if( key == node.key ) return node.value
        if( key< node.key ) return get(node.left, key)
        else return get(node.right, key)
      }

      def insert(key:Int, value: Int): Unit = {
        this.root = insert(this.root, key, value)
      }

      def delete(key:Int) : Unit = {
        this.root = delete(this.root, key)
      }

      def get(key:Int):Int = {
        return get(this.root, key)
      }
    }

    class KVNode(var key:Int, var value:Int){
      var left :KVNode = null
      var right :KVNode = null
    }

    def _hash(key:Int):Int = {
      key % BUCKET_NUM
    }
    /** value will always be non-negative. */
    def put(key: Int, value: Int):Unit = {
      buckets(_hash(key)).insert(key, value)
    }

    ///** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    def get(key: Int): Int = {
      buckets(_hash(key)).get(key)
    }

    ///** Removes the mapping of the specified value key if this map contains a mapping for the key */
    def remove(key: Int):Unit =  {
      buckets(_hash(key)).delete(key)
    }

}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * var obj = new MyHashMap()
 * obj.put(key,value)
 * var param_2 = obj.get(key)
 * obj.remove(key)
 */


//var obj = new MyHashMap()
//obj.put(1,1)
//var param_2 = obj.get(1)
//obj.remove(1)

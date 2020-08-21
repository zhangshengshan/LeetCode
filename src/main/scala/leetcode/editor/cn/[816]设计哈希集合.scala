//不使用任何内建的哈希表库设计一个哈希集合 
//
// 具体地说，你的设计应该包含以下的功能 
//
// 
// add(value)：向哈希集合中插入一个值。 
// contains(value) ：返回哈希集合中是否存在这个值。 
// remove(value)：将给定值从哈希集合中删除。如果哈希集合中没有这个值，什么也不做。 
// 
//
// 
//示例: 
//
// MyHashSet hashSet = new MyHashSet();
//hashSet.add(1);         
//hashSet.add(2);         
//hashSet.contains(1);    // 返回 true
//hashSet.contains(3);    // 返回 false (未找到)
//hashSet.add(2);          
//hashSet.contains(2);    // 返回 true
//hashSet.remove(2);          
//hashSet.contains(2);    // 返回  false (已经被删除)
// 
//
// 
//注意： 
//
// 
// 所有的值都在 [0, 1000000]的范围内。 
// 操作的总数目在[1, 10000]范围内。 
// 不要使用内建的哈希集合库。 
// 
// Related Topics 设计 哈希表 































///** Initialize your data structure here. */
//import scala.collection.mutable.ListBuffer
//val BUCKETS = 769
//val bucketArray = new Array[ListBuffer[Int]](BUCKETS)
//for(i<-0 until BUCKETS){
//bucketArray(i) = new ListBuffer[Int]()
//}
//def _hash(value:Int):Int = {
//return value % BUCKETS
//}
//def add(key: Int) {
//val hash = _hash(key)
//if(bucketArray(hash).contains(key)) return 
//else bucketArray(hash).append(key)
//}
//def remove(key: Int) {
//val hash = _hash(key)
//if(bucketArray(hash).contains(key)) {
////println("contains")
//bucketArray(hash).-=(key)
//}
//}
///** Returns true if this set contains the specified element */
//def contains(key: Int): Boolean = {
//val hash = _hash(key)
//return bucketArray(hash).contains(key)
//}















class MyHashSet() {

  /** Initialize your data structure here. */
  val BUCKET_NUM = 797
  val buckets = new Array[Tree](BUCKET_NUM)

  for(i<- 0 until BUCKET_NUM) {
    buckets(i) = new Tree()
  }

  class TreeNode(var _value: Int) {
    val value = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }

  class Tree(){
    var root : TreeNode = null
    def insert(key:Int):Unit = {
      this.root = insert(this.root, key)
    }

    def contains(node: TreeNode, key:Int) :Boolean = {
      if( node == null ) return false 
      if(node.value == key) return true
      if(key < node.value) return contains(node.left, key)
      else return contains(node.right, key)
    }

    def contains(key: Int):Boolean = {
      contains(this.root, key)
    }

    def walk(node:TreeNode):Unit = {
      if(node == null) return
      //println(s" node.value = ${node.value}")
      walk(node.left)
      walk(node.right)
    }

    def walk(): Unit = {
      walk(this.root)
    }
    def insert(node: TreeNode, key:Int):TreeNode = {
      if(node == null) return new TreeNode(key)
      var ret :TreeNode = null
      if( key < node.value){
        node.left = insert(node.left,key)
      }else if ( key ==  node.value ){
        //do nothing here for item already in the tree
      }else {
        node.right = insert(node.right, key)
      }
      return node
    }
    def delete(key: Int):Unit = {
      this.root = delete(this.root, key)
    }

    def delete(node: TreeNode, key:Int ):TreeNode = {

      if(node == null) return null

      val leftPrev = node
      var tmp = node.left

      while(tmp!=null && tmp.right != null){
        tmp = tmp.right
      }

      val rightPrev = tmp

      if(rightPrev==null){
        //println(s" rightPrev is null")
      }

      if(node.value == key) {
        //println(s"node.value == ${node.value}")
        if( rightPrev == null ) {

          return node.right

        } else {

          rightPrev.right = node.right

          return node.left

        }
      }
      if( key < node.value ){
        node.left = delete(node.left,key)
      }else {
        node.right = delete(node.right,key)
      }
      return node
    }
  }

  def _hash(key:Int):Int = {
    return key % BUCKET_NUM
  }

  def add(key: Int):Unit =  {
    buckets(_hash(key)).insert(key)
  }

  def remove(key: Int) {
    buckets(_hash(key)).delete(key)
  }

  /** Returns true if this set contains the specified element */
  def contains(key: Int): Boolean = {
    buckets(_hash(key)).contains(key)
  }

  def size(node: TreeNode): Int = {
    if(node == null) return 0 
    return 1 + size(node.left) + size(node.right)
  }
  def size():Int = {
    buckets.map( x =>  size(x.root)).sum
  }
}


//val t = new Tree()
//t.insert(4)
//t.insert(2)
//t.insert(3)
//t.insert(1)
//t.insert(6)
//t.insert(7)

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = new MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */


//val obj = new MyHashSet()
//obj.add(3)
//println(obj.contains(3))
//obj.remove(3)
//val s = new MyHashSet()
//s.add(5)
//s.add(3)
//s.add(1)
//s.add(2)
//s.add(4)
//s.add(6)
//s.add(7)
//s.add(9)
//s.add(8)

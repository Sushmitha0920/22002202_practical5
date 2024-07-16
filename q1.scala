import scala.io.StdIn.readLine

object InventorySystem{

    def getProductList(): List[String] = {
        val productList: List[String]
        var condition = true

        while(condition){
            val product = readLine("Enter the product names (type 'done' to finish) : ")
            if(product.toLowerCase() == "done"){
                condition = false
            }else{
                productList += product
            }
        }
        productList
    }

    def printProductList(productList: List[String], index: Int = 1): Unit = {
        println(s"${index}. ${productList.head}")
        printProductList(productList.tail, index + 1)
    }
    
    def getTotalProducts(printProductList: List[String]): Int = {
        productList.length
    }

    def main(args: Array[String]): Unit = {
        val productList = getProductList()

        printProductList(productList)
        println(s"Total no. of products : ${getTotalProducts(productList)}")
    }
}
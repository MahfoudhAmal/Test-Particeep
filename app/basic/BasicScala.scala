package com.particeep.test.basic

/**
 * This is basic language questions so don't use external library or build in function
 */
object BasicScala {

  /**
   * Encode parameter in url format
   *
   * Example:
   *
   * input  : Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")
   * output : "?sort_by=name&order_by=asc&user_id=12"
   *
   * input  : Map()
   * output : ""
   */
  def encodeParamsInUrl(params: Map[String, String]): String = "?" + params.map{case (k, v) => k + "=" + v}.mkString("&")

  /**
   * Test if a String is an email
   */
  def isEmail(maybeEmail: String): Boolean =  if("""(?=[^\s]+)(?=(\w+)@([\w\.]+))""".r.findFirstIn(maybeEmail) == None)false else true

  /**
   * Compute i ^ n
   *
   * Example:
   *
   * input : (i = 2, n = 3) we compute 2^3 = 2x2x2
   * output : 8
   *
   * input : (i = 99, n = 38997)
   * output : 1723793299
   */
  def power(i: Int, n: Int): Int = if (i*n==0) 1 else i*power(i, n - 1)

}

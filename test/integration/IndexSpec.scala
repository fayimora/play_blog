import org.scalatest.{FunSpec, BeforeAndAfterEach, Matchers}
import org.scalatest.selenium.HtmlUnit

class IndexSpec extends FunSpec with Matchers with BeforeAndAfterEach with HtmlUnit {
  val host = "http://localhost:9000/"

  override def beforeEach {
    goTo (host)
  }

  describe("Index page") {
    it("should have the correct title") {
      pageTitle should be ("Play Blog")
    }

    it("should have the correct content") {
      tagName("h1").element.text should equal ("Hello Fayimora!")
    }
  }
}

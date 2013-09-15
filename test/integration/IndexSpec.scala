import org.scalatest.{FunSpec, BeforeAndAfterAll, Matchers}
import org.scalatest.selenium.HtmlUnit

class IndexSpec extends FunSpec with Matchers with BeforeAndAfterAll with HtmlUnit {
  override def beforeAll {
    go to ("http://localhost:9000/")
  }
  override def afterAll {
    quit()
  }

  describe("Index page") {
    it("should have the correct title") {
      pageTitle should be ("Play Blog")
    }

    it("should have the correct content") {
      find("h1") should equal (Some("Hello Fayimora!"))
    }
  }
}

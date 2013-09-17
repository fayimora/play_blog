import org.scalatest.{FunSpec, Matchers}
import play.api.test._
import play.api.test.Helpers._

class ApplicationSpec extends FunSpec with Matchers {
  describe("Application Controller"){
    it("should return a 200"){
      running(FakeApplication()) {
        val index = route(FakeRequest(GET, "/")).get
        status(index) should be (OK)
      }
    }
  }
}

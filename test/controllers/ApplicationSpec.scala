import org.scalatest.{FunSpec, Matchers}
import play.api.test._
import play.api.test.Helpers._
import controllers.routes._

class ApplicationSpec extends FunSpec with Matchers {
  describe("Application Controller") {
    it("index route should return a status code 200"){
      running(FakeApplication()) {
        val index = route(FakeRequest(GET, Application.index.url)).get
        status(index) should be (OK)
      }
    }
  }
}

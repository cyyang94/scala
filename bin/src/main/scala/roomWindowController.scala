import scalafxml.core.macros.sfxml
import scalafx.scene.control.ListView
import scalafx.Includes._
import scalafx.event.ActionEvent
import akka.pattern.ask
import scala.concurrent.duration._
import scalafx.application.Platform
import scalafx.stage.Stage
import scalafx.collections.ObservableBuffer

@sfxml
class roomWindowController(
    private val listView: ListView[player]
) {
  private var _dialogStage : Option[Stage] = None
  
  def dialogStage = _dialogStage.get
  def dialogStage_= (x : Stage)
  {
    _dialogStage = Some(x)
  }
  
  def setPlayerList(players: Iterable[player]){
    listView.userData = players
  }
  
  def handleReady(event: ActionEvent){
    
  }
  
  val players = new ObservableBuffer[player]()
  
  listView.items = players
}
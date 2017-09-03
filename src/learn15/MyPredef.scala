package learn15

import java.io.File

/**
  * Created by anderson on 17-9-3.
  */
object MyPredef {
  implicit def filt2RichFile (file : File) : RichFile = new RichFile(file)
}

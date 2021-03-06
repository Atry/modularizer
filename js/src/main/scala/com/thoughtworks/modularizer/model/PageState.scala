package com.thoughtworks.modularizer.model

import com.thoughtworks.binding.Binding.Var
import com.thoughtworks.binding.JsonHashRoute
import upickle.default._

/**
  * @author 杨博 (Yang Bo)
  */
sealed trait PageState

object PageState {

  sealed trait WorkBoardState
  object WorkBoardState {
    case object Summary extends WorkBoardState

    // Workaround for https://github.com/scala/bug/issues/7046
    implicit val readWriter: ReadWriter[WorkBoardState] = ReadWriter.merge(
      macroRW[Summary.type],
    )

  }

  case object ImportJdepsDotFile extends PageState
  final case class WorkBoard(graphState: WorkBoardState) extends PageState

  // Workaround for https://github.com/scala/bug/issues/7046
  implicit val readWriter: ReadWriter[PageState] = ReadWriter.merge(
    macroRW[ImportJdepsDotFile.type],
    macroRW[WorkBoard],
  )

}

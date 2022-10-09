package com.polinayantsen.library

import zio.*

object MainApp extends ZIOAppDefault {
  val run = Console.printLine("Hello World")
}
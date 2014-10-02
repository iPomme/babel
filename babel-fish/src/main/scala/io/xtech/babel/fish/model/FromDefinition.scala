/*
 *
 *  Copyright 2010-2014 Crossing-Tech SA, EPFL QI-J, CH-1015 Lausanne, Switzerland.
 *  All rights reserved.
 *
 * ==================================================================================
 */

package io.xtech.babel.fish.model

// TODO will be fixed in 2.12 https://issues.scala-lang.org/browse/SI-6541

import scala.language.existentials

/**
  * The FromDefinition define the start of the route.
  * @param outClass The type of object generated by the source.
  * @param source The source (endpoint) generating the message.
  */
case class FromDefinition(outClass: Class[_], source: Source[_]) extends StepDefinition

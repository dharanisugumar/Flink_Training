package com.akamai.nsecore.Operators

import org.apache.flink.api.common.functions.RichFlatMapFunction
import org.apache.flink.util.Collector

class FlatMap extends RichFlatMapFunction{
  override def flatMap(in: Nothing, collector: Collector[Nothing]): Unit = ???
}

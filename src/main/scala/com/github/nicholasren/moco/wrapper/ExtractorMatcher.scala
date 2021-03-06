package com.github.nicholasren.moco.wrapper

import com.github.dreamhead.moco.{Moco, RequestExtractor}
import com.github.dreamhead.moco.resource.Resource


case class ExtractorMatcher(extractor: RequestExtractor[_ <: Any]) {
  def ===(expected: String) = Moco.eq(extractor, expected)

  def ===(expected: Resource) = Moco.eq(extractor, expected)

  def matched(expected: String) = Moco.`match`(extractor, expected)
}

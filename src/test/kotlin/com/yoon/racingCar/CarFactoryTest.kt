package com.yoon.racingCar

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class CarFactoryTest{

  @Test
  @DisplayName("참가자 수만큼 Racing Car 가 생성된다.")
  fun name() {
    val actual = CarFactory.factory(3)

    actual.size shouldBe 3
  }

  @Test
  @DisplayName("참가자 수가 1보다 작을 경우 예외가 발생한다.")
  fun name2() {
    val exception = shouldThrow<IllegalArgumentException> {
      CarFactory.factory(-1)
    }
    exception.localizedMessage shouldBe "ParticipationCount more then 0"
  }
}

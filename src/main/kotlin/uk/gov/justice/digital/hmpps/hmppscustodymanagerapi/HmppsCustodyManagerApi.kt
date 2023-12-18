package uk.gov.justice.digital.hmpps.hmppscustodymanagerapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication()
class HmppsCustodyManagerApi

fun main(args: Array<String>) {
  runApplication<HmppsCustodyManagerApi>(*args)
}

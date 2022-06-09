// Generated by Selenium IDE
const { Builder, By, Key, until } = require('selenium-webdriver')
const assert = require('assert')

describe('Acessando-Google', function() {
  this.timeout(30000)
  let driver
  let vars
  beforeEach(async function() {
    driver = await new Builder().forBrowser('firefox').build()
    vars = {}
  })
  afterEach(async function() {
    await driver.quit();
  })
  it('Acessando-Google', async function() {
    await driver.get("https://www.globo.com/")
    await driver.manage().window().setRect({ width: 1860, height: 1053 })
    await driver.findElement(By.name("q")).click()
    await driver.findElement(By.css("center:nth-child(1) > .RNmpXc")).click()
    await driver.findElement(By.css(".on img")).click()
    await driver.findElement(By.css(".history-card:nth-child(15) img")).click()
    await driver.findElement(By.css(".history-card:nth-child(16) img")).click()
    await driver.findElement(By.id("searchinput")).click()
    await driver.findElement(By.id("searchinput")).sendKeys("aloha")
    await driver.findElement(By.id("searchbtn")).click()
  })
})
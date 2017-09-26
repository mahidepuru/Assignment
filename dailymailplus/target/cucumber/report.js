$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("dailymailpluss/imageupload.feature");
formatter.feature({
  "line": 1,
  "name": "upload image",
  "description": "",
  "id": "upload-image",
  "keyword": "Feature"
});
formatter.before({
  "duration": 83799280,
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: /home/mahidhar/Desktop/chromedriver/chromedriver.exe\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:177)\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:117)\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:112)\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:89)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:117)\n\tat dailymailpluss.Stepdefinition.openbrowser(Stepdefinition.java:15)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:35)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:12)\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:59)\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:213)\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:201)\n\tat cucumber.runtime.Runtime.runBeforeHooks(Runtime.java:191)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:36)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:83)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:82)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:41)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:87)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:160)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:234)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:74)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)\n",
  "status": "failed"
});
formatter.scenario({
  "line": 3,
  "name": "upload an image",
  "description": "",
  "id": "upload-image;upload-an-image",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@uploadimage"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "i am on imageupload main page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "i click on upload file",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "select image to upload",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "i should successfully upload an image",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.i_am_on_imageupload_main_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.i_click_on_upload_file()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.select_image_to_upload()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.i_should_successfully_upload_an_image()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 143320,
  "error_message": "java.lang.NullPointerException\n\tat dailymailpluss.Stepdefinition.closebrowser(Stepdefinition.java:20)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:35)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:12)\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:59)\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:213)\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:201)\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:195)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:42)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:83)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:82)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:41)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:87)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:160)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:234)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:74)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)\n",
  "status": "failed"
});
});
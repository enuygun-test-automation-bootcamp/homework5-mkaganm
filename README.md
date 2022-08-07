# HOMEWORK 5

1-Appium'da test yazılıp, bu testler için try catch kullanılarak FileNotFundException, NullPointerException vb. exceptionlar için exception handling yapılacak.
-Extra Puan için dileyenler Capability Check yapabilir. (Gerçekten json dosyasından aldığım cihazı mı test ediyorum?)
2-Contact Manager uygulamasının senaryoları yazılacak. https://github.com/movilidadagil/ContactManagerAPIProject
3-Charles Proxy araştırılacak. (Optional-İsteyen araştırabilir, zorunlu değil)
Not: Bu ödevde README.md dosyalarınızın özenli olmasını bekliyor olacağız.

---

:pushpin: SessionNotFoundException - Appium Bağlantısı kesildiğinde veya oturum kurulmadığında atılır.

:pushpin: ElementNotFoundException - Bir Element bulmaya çalıştığınızda atılır ve ardından element Bulunmaz.

:pushpin: WebDriverException - Sürücü olmadığında atılır.

---


[AddContactToHomeTest](https://github.com/enuygun-test-automation-bootcamp/homework5-mkaganm/blob/main/src/test/java/testng/AddContactToHomeTest.java) - home etiketi ile ana sayfa testleri, kayıt sayfası testleri, kullanıcı kaydı vb. testlerin bulunduğu test sınıfı

[AddContactToMobileTest](https://github.com/enuygun-test-automation-bootcamp/homework5-mkaganm/blob/main/src/test/java/testng/AddContactToMobileTest.java)- mobile etiketi ile ana sayfa testleri, kayıt sayfası testleri, kullanıcı kaydı vb. testlerin bulunduğu test sınıfı

[AddContactToWorkTest](https://github.com/enuygun-test-automation-bootcamp/homework5-mkaganm/blob/main/src/test/java/testng/AddContactToWorkTest.java)- work etiketi ile ana sayfa testleri, kayıt sayfası testleri, kullanıcı kaydı vb. testlerin bulunduğu test sınıfı


[ContactManager.feature](https://github.com/enuygun-test-automation-bootcamp/homework5-mkaganm/blob/main/src/test/resources/features/contactManager.feature) - test senaryolarının bulunduğu cucumber dosyası

[android-oreo.json](https://github.com/enuygun-test-automation-bootcamp/homework5-mkaganm/blob/main/src/test/resources/capabilities/android-oreo.json) - android capabilities in bulunduğu json dosyası

[Devices](https://github.com/enuygun-test-automation-bootcamp/homework5-mkaganm/blob/main/src/test/java/devices/Devices.java) - cihaz yollarının bulunduğu enum

[User](https://github.com/enuygun-test-automation-bootcamp/homework5-mkaganm/blob/main/src/test/java/model/User.java) - User modelin bulunduğu sınıf

[BasePage](https://github.com/enuygun-test-automation-bootcamp/homework5-mkaganm/blob/main/src/test/java/pages/BasePages.java) - diğer page sayfalarının extend ettiği page sınıfı

[HomePage](https://github.com/enuygun-test-automation-bootcamp/homework5-mkaganm/blob/main/src/test/java/pages/HomePage.java) - ana sayfanın elementlerinin bludunduğu sınıf

[AddContactPage](https://github.com/enuygun-test-automation-bootcamp/homework5-mkaganm/blob/main/src/test/java/pages/AddContactPage.java) - kayıt sayfasının elementlerinin bulunduğu sınıf

[DeviceSetup](https://github.com/enuygun-test-automation-bootcamp/homework5-mkaganm/blob/main/src/test/java/utility/DeviceSetup.java) - cihaz başlangıcı için gerekli ayarlamaları json dosyasından alıp dönüştüren sınıf

[FakeUserGenerator](https://github.com/enuygun-test-automation-bootcamp/homework5-mkaganm/blob/main/src/test/java/utility/FakeUserGenerator.java) - sahte kullanıcı işlemlerinin bulunduğu sınıf

[FindPath](https://github.com/enuygun-test-automation-bootcamp/homework5-mkaganm/blob/main/src/test/java/utility/FindPath.java) - sonra geliştirilmek üzere eklenen path sınıfı

---
:pushpin: TestNG - Testler için kullanıldı.

:pushpin: lombok - getter setter metodları için kullanıldı.

:pushpin: appium - Android driver için kullanıldı.

:pushpin: javafaker - fake kullanıcı oluşturmak için kullanıldı.

:pushpin: cucumber - test senaryolarının yazılı olarak durması için kullanıldı. Proje açısından işlevi yok.





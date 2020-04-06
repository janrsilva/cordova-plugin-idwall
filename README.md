## cordova-plugin-idwall
Esse plugin permite usar os sdks da idwall para Android e iOS.

**Aviso:** A construção desse plugin não é mantida e possui nenhum vínculo com a https://idwall.co/, esse é um projeto open source.

Logo abaixo, está sendo construída uma documentação de uso.

#### Requisitos

##### Android
- cordova >= 9.0.0 (não testado para versões anteriores)
- cordova-android >=8.0.0 (não testado para versões anteriores)
- Versão mínima do sdk android `minSdkVersion=19`
```xml
<!-- config.xml -->
<preference name="android-minSdkVersion" value="19" />
```
### Instruções de uso

#### Instalação
```bash
$ cordova plugin add cordova-plugin-idwall --save
```
#### Configuração

##### Android
O SDK do idwall exige que o tema do android seja o `Theme.AppCompat` ou ascendentes, portanto é necessário adicionar uma configuração ao seu config.xml conforme abaixo:

```xml
<!-- config.xml -->
<platform name="android">
    ...
    <edit-config file="AndroidManifest.xml" target="/manifest/application" mode="merge">
        <application android:theme="@style/Theme.AppCompat.NoActionBar" />
    </edit-config>
</platform>
```

*Obs: para instrução acima funcionar será necessário adicionar o namespace android ao config.xml, ignore caso já tenha o feito*

```xml
<!-- config.xml -->
<?xml version='1.0' encoding='utf-8'?>
<widget id="br.com.example.app" [...] xmlns:android="http://schemas.android.com/apk/res/android">
    [...]
</widget>
```
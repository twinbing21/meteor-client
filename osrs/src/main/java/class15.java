import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.security.Security;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

@ObfuscatedName("h")
public class class15 extends SSLSocketFactory {
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lh;"
   )
   static class15 field52;
   @ObfuscatedName("f")
   SecureRandom field53 = new SecureRandom();

   static {
      if (Security.getProvider("BC") == null) {
         Security.addProvider(new BouncyCastleProvider());
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;B)Ljavax/net/ssl/SSLSocket;",
      garbageValue = "13"
   )
   SSLSocket method56(String var1, TlsClientProtocol var2) {
      return new class12(this, var2, var1);
   }

    @ObfuscatedName("createSocket")
    public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
      if (var1 == null) {
         var1 = new Socket();
      }

      if (!var1.isConnected()) {
         var1.connect(new InetSocketAddress(var2, var3));
      }

      TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field53);
      return this.method56(var2, var5);
   }

   public String[] getSupportedCipherSuites() {
      return null;
   }

   public Socket createSocket(String var1, int var2) throws IOException, UnknownHostException {
      return null;
   }

   public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
      return null;
   }

   public Socket createSocket(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
      return null;
   }

   public String[] getDefaultCipherSuites() {
      return null;
   }

   public Socket createSocket(InetAddress var1, int var2) throws IOException {
      return null;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Lh;",
      garbageValue = "-258979653"
   )
   public static class15 method57() {
      if (field52 == null) {
         field52 = new class15();
      }

      return field52;
   }
}

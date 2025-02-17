import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
@Implements("NodeDeque")
public class NodeDeque {
    @ObfuscatedName("f")
    @ObfuscatedSignature(
            descriptor = "Lpr;"
    )
    public Node sentinel = new Node();
    @ObfuscatedName("w")
    @ObfuscatedSignature(
            descriptor = "Lpr;"
    )
    Node current;

   public NodeDeque() {
      this.sentinel.previous = this.sentinel;
      this.sentinel.next = this.sentinel;
   }

    @ObfuscatedName("f")
    public void clear() {
      while(true) {
         Node var1 = this.sentinel.previous;
         if (var1 == this.sentinel) {
            this.current = null;
            return;
         }

         var1.remove();
      }
   }

    @ObfuscatedName("w")
    @ObfuscatedSignature(
            descriptor = "(Lpr;)V"
    )
    public void addFirst(Node var1) {
      if (var1.next != null) {
         var1.remove();
      }

      var1.next = this.sentinel.next;
      var1.previous = this.sentinel;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

    @ObfuscatedName("v")
    @ObfuscatedSignature(
            descriptor = "(Lpr;)V"
    )
    public void addLast(Node var1) {
      if (var1.next != null) {
         var1.remove();
      }

      var1.next = this.sentinel;
      var1.previous = this.sentinel.previous;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

    @ObfuscatedName("z")
    @ObfuscatedSignature(
            descriptor = "()Lpr;"
    )
    public Node removeLast() {
      Node var1 = this.sentinel.previous;
      if (var1 == this.sentinel) {
         return null;
      } else {
         var1.remove();
         return var1;
      }
   }

    @ObfuscatedName("j")
    @ObfuscatedSignature(
            descriptor = "()Lpr;"
    )
    public Node removeFirst() {
      Node var1 = this.sentinel.next;
      if (var1 == this.sentinel) {
         return null;
      } else {
         var1.remove();
         return var1;
      }
   }

    @ObfuscatedName("i")
    @ObfuscatedSignature(
            descriptor = "()Lpr;"
    )
    public Node last() {
      Node var1 = this.sentinel.previous;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previous;
         return var1;
      }
   }

    @ObfuscatedName("n")
    @ObfuscatedSignature(
            descriptor = "()Lpr;"
    )
    public Node first() {
      Node var1 = this.sentinel.next;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.next;
         return var1;
      }
   }

    @ObfuscatedName("l")
    @ObfuscatedSignature(
            descriptor = "()Lpr;"
    )
    public Node previous() {
      Node var1 = this.current;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previous;
         return var1;
      }
   }

    @ObfuscatedName("k")
    @ObfuscatedSignature(
            descriptor = "()Lpr;"
    )
    public Node next() {
      Node var1 = this.current;
      if (var1 == this.sentinel) {
         this.current = null;
         return null;
      } else {
         this.current = var1.next;
         return var1;
      }
   }

    @ObfuscatedName("s")
    @ObfuscatedSignature(
            descriptor = "(Lpr;Lpr;)V"
    )
    public static void NodeDeque_addBefore(Node var0, Node var1) {
      if (var0.next != null) {
         var0.remove();
      }

      var0.next = var1.next;
      var0.previous = var1;
      var0.next.previous = var0;
      var0.previous.next = var0;
   }
}

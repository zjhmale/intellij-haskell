// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;
import scala.Option;
import scala.collection.Seq;

public interface HaskellInstanceDeclaration extends HaskellDeclarationElement {

  @Nullable
  HaskellCidecls getCidecls();

  @Nullable
  HaskellIncoherentPragma getIncoherentPragma();

  @NotNull
  HaskellInst getInst();

  @Nullable
  HaskellOverlapPragma getOverlapPragma();

  @NotNull
  HaskellQName getQName();

  @Nullable
  HaskellScontext getScontext();

  @NotNull
  List<HaskellVarCon> getVarConList();

  String getName();

  ItemPresentation getPresentation();

  Seq<HaskellNamedElement> getIdentifierElements();

  Option<String> getModuleName();

}
